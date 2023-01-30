provider "kubernetes" {
  config_context_cluster = "my-app-cluster"
}

resource "app_pod" "app" {
  metadata {
    name = "app-pod"
  }
  spec {
    container {
      image = "app:latest"
      name  = "app-container"
    }
  }
}


