def call(Map stageParams) {
    checkout (branches: [[name: '${stageParams.branch}']], extensions: [], userRemoteConfigs: [[url: '${stageParams.url}']])
    // checkout([
    //     $class: 'GitSCM',
    //     branches: [[name:  stageParams.branch ]],
    //     userRemoteConfigs: [[ url: stageParams.url ]]
    // ])
  }
