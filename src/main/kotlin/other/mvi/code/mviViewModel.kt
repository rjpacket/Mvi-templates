package other.mvi.code

fun mviViewModel(
    packageName: String,
    fragmentName: String
) = """
package ${packageName}.${fragmentName.toLowerCase()}

import android.app.Application
import com.mi.car.map.feature.common.viewmodel.BaseViewModel

class ${fragmentName}ViewModel(application: Application) : BaseViewModel<${fragmentName}WidgetState, ${fragmentName}WidgetEvent>(application) {

    init {
        uiState = ${fragmentName}WidgetState()
    }

    override fun dispatch(viewEvent: ${fragmentName}WidgetEvent) {

    }
}
"""