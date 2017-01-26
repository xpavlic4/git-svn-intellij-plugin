package com.laurinka.intellij.plugins.gitsvn

import com.intellij.openapi.actionSystem.{AnAction, AnActionEvent, PlatformDataKeys}
import com.intellij.openapi.ui.Messages

/**
  * Action performs "git svn rebase" command.
  */
class GitSvnRebaseAction extends AnAction("Git SVN rebase") {

  override def actionPerformed(event: AnActionEvent): Unit = {
    val project = event.getData(PlatformDataKeys.PROJECT_CONTEXT);

    Messages.showMessageDialog(project, "Hello!\n I am glad to see you.", "Information", Messages.getInformationIcon);
  }
}
