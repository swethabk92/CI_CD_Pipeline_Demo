provider "docker" {
  host = "tcp://localhost:8080"
}

provider "kubernetes" {
  config_path = "~/.kube/config"
}

module "cicd_pipeline" {
  source = "./modules/cicd_pipeline"

  container_image = "app"
  container_tag = "v1.0"
  container_registry = "docker.io"
  kubernetes_namespace = "default"
  kubernetes_service_name = "my-app-service"
  git_repository = "https://github.com/swethabk92/CI_CD_Pipeline_Demo"
  git_branch = "master"
}
