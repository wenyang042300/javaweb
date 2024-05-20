<template>
    <div id="login-all">
       <div id="my">
       </div>
       <div id="login">
        <el-card class="box-card">
          <div id="form">
            <div class="title">
                <span>注册界面</span>
            </div>
            <el-input  placeholder="请输入姓名" v-model="personId" style="margin-top: 20px;"></el-input>
            <el-input placeholder="请输入密码" v-model="password" show-password style="margin-top: 20px;"></el-input>
            <el-button type="primary" round style="margin:20px 150px;"
            v-on:click="login"
            >注册</el-button>
          </div>
        </el-card>
       </div>
    </div>
</template>
<style scoped>
  #login-all{
    /* background-color: darkseagreen; */
    position: fixed;
    height: 100%;
    width: 100%;
    top:0;
    left:0;
    background-image: linear-gradient(
        90deg,
        cyan,
        rgb(128, 92, 0)
    );
    background-size: 400%;
    animation: myanimation 10s infinite;
}

@keyframes myanimation{
    0%{
        background-position: 0% 50%;
    }
    50%{
        background-position: 100% 50%;
    }
    100%{
        background-position: 0% 50%;
    }
}
#my{
    color:aliceblue;
    font-size: 25px;
    font-weight: 800;
    text-transform: uppercase;
    text-align: center;
}
#login{
    margin: 160px auto;
    /* height: 30%; */
    width: 400px;
}

.el-card{
    width: 400px;
    height: 250px;
    background-color: rgba(255,255,255,0.4);
}
.title{
  font-size: 21px;
  text-align: center;
  color: rgb(12, 12, 12);
}
</style>
<script>
export default{
  data () {
    return {
      personId: '',
      password: ''
    }
  },
  methods: {
    login: function (e) {
      const xmr = new XMLHttpRequest()
      const callbackName = 'jsonpCallback_' + Date.now()
      const url = `http://localhost:8080/userService/register/${this.personId}/${this.password}`
      xmr.open('GET', url)
      xmr.setRequestHeader('Content-type', 'application/json')
      xmr.onreadystatechange = function () {
        if (xmr.readyState !== 4) {
          console.log('请求中')
        }
        if (xmr.readyState === 4) {
          if (xmr.status === 200) {
            console.log(xmr)
            alert('注册成功')
          } else {
            console.log(xmr.status)
            alert('用户名已存在')
          }
        }
      }
      xmr.onerror = function () {
        console.log('请求失败')
      }
      xmr.send()
    }
  }
}

</script>
