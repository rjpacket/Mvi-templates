package other.mvi.code

fun mviFragment(
    fragmentName: String,
    layoutName: String,
    packageName: String
) = """
package ${packageName}.${fragmentName.toLowerCase()}

import androidx.fragment.app.viewModels
import com.mi.car.map.feature.common.viewmodel.WrapperFragment
import ${packageName}.R
import ${packageName}.databinding.Fragment${fragmentName}Binding

class ${fragmentName}Fragment : WrapperFragment<${fragmentName}WidgetState, ${fragmentName}WidgetEvent, ${fragmentName}ViewModel, Fragment${fragmentName}Binding>() {
    override val viewModel: ${fragmentName}ViewModel by viewModels()

    override fun layoutId(): Int {
        return R.layout.${layoutName}
    }

    override fun initView() {

    }

    override fun initListener() {

    }

    override fun renderViewState(viewState: ${fragmentName}WidgetState) {
        
    }
}
"""