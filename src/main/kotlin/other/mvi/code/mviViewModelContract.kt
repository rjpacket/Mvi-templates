package other.mvi.code

fun mviViewModelContract(
    packageName: String,
    fragmentName: String
) = """
package ${packageName}.${fragmentName.toLowerCase()}

data class ${fragmentName}WidgetState(
    var uiStateChange: ${fragmentName}WidgetChange? = null
)

sealed class ${fragmentName}WidgetChange {
    object ${fragmentName}WidgetInitialChange : ${fragmentName}WidgetChange()
}

sealed class ${fragmentName}WidgetEvent {
    object ${fragmentName}WidgetInitialEvent : ${fragmentName}WidgetEvent()
} 
"""