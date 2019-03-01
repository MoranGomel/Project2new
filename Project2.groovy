timeout(time: 5, unit: 'MINUTES'){
node{
    stage("build"){

    dir('C:\\Program Files\\Docker Toolbox\\app_jenkins') {
   git 'https://github.com/MoranGomel/Project2.git '
}
   dir('C:\\Program Files\\Docker Toolbox\\app_jenkins') {
     bat 'python project2.py'} && dir('C:\\Program Files\\Docker Toolbox\\app_jenkins') {
     bat 'docker-compose up'}

}
}
}
