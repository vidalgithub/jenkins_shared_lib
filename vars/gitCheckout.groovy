def call(Map stageParams) {
    
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ?: 'main']],
        userRemoteConfigs: [[ url: stageParams.url ?: 'https://default/repo.git']]
    ])
  }
