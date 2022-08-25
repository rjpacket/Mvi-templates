package other.mvi

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.mvi.code.mviFragment
import other.mvi.code.mviViewModel
import other.mvi.code.mviViewModelContract
import other.mvi.layout.mviFragmentXml

fun RecipeExecutor.mviFragmentRecipe(
    moduleData: ModuleTemplateData,
    fragmentName: String,
    layoutName: String,
    packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension

    val dirName = fragmentName.toLowerCase()

    val mviFragment = mviFragment(fragmentName, layoutName, packageName)
    // 保存Fragment
    save(mviFragment, srcOut.resolve("${dirName}/${fragmentName}Activity.${ktOrJavaExt}"))
    // 保存xml
    save(mviFragmentXml(), resOut.resolve("layout/${layoutName}.xml"))
    // 保存ViewModel
    save(mviViewModel(packageName, fragmentName), srcOut.resolve("${dirName}/${fragmentName}ViewModel.${ktOrJavaExt}"))
    // 保存ViewModelContract
    save(mviViewModelContract(packageName, fragmentName), srcOut.resolve("${dirName}/${fragmentName}ViewModelContract.${ktOrJavaExt}"))
}