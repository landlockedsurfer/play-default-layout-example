package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{BaseController, ControllerComponents}

@Singleton
class ApplicationController @Inject ()(val controllerComponents: ControllerComponents) extends BaseController {



  def index = Action {
    Ok(views.html.core(models.Constants.message))
  }
}