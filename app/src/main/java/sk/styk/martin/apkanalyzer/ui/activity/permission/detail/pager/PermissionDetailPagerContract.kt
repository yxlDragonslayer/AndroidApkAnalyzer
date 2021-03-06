package sk.styk.martin.apkanalyzer.ui.activity.permission.detail.pager

import android.content.pm.PackageManager
import android.os.Bundle
import sk.styk.martin.apkanalyzer.model.permissions.LocalPermissionData
import sk.styk.martin.apkanalyzer.ui.base.BasePresenter

/**
 * @author Martin Styk
 * @version 28.01.2018.
 */
interface PermissionDetailPagerContract {
    interface View {
        fun setUpViews()
    }

    interface Presenter : BasePresenter<View> {
        val localPermissionData: LocalPermissionData

        fun initialize(bundle: Bundle)

        fun loadPermissionDescription(packageManager: PackageManager): String

    }
}