provider "docker" {
  host = "tcp://localhost:2375"
}

provider "kubernetes" {
  config_path = "~/.kube/config"
}

module "cicd_pipeline" {
  source = "./modules/cicd_pipeline"

  container_image = "my_image"
  container_tag = "v1.0"
  container_registry = "docker.io"
  kubernetes_namespace = "default"
  kubernetes_service_name = "my-service"
  git_repository = "https://github.com/myuser/myrepo.git"
  git_branch = "master"
}
