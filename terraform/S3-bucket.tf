resource "aws_s3_bucket" "app_storing_bucket" {
  bucket = var.bucketName
}


data "archive_file" "app_file" {
  type        = var.zipFile
  source_dir  = var.sorceDir
  output_path = "${path.module}/${var.codeObjectkey}"
}


resource "aws_s3_object" "app_item" {
  bucket = aws_s3_bucket.app_storing_bucket.bucket
  key    = var.codeObjectkey
  source = data.archive_file.app_file.output_path
}