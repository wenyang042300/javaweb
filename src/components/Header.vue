<template>
  <div class="header">
      <div class="jumbotron">
        <img src="../assets/images/logo-white.svg" alt="logo" class="img">
        <div class="button">
        <a class="btn btn-primary btn-lg" href="#" role="button" @click="Login">登录</a>
        <a class="btn btn-primary btn-lg" href="#" role="button" @click="Register">注册</a>
        </div>
        <h1>云端编程，浏览器里边学边练</h1>
        <p>软件定义一切，网络连接时空，学习软件技术，创造未来世界。</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button" @click="showPopup">马上学习</a></p>
      </div>
  </div>
</template>

<script>

export default {
  methods: {
    showPopup () {
      alert('马上学习')
    },
    Login () {
      this.$router.push('/Login')
    },
    Register () {
      this.$router.push('/Register')
    }
  }
}
</script>

<style scoped>
.jumbotron {
  background-image: url(../assets/images/home-banner@2x.jpg);
  height: 300px;
  text-align: center;
  color: #fff;
}
.btn {
  margin-top: 20px;
  background-color: #fff;
  color: rgb(54,101,227);
}
.button {
  float: right;
  margin-top: -60px;
  margin-right: 50px;
  background-color: transparent;
}
.button .btn {
  background-color: transparent;
  border: 1px solid #fff;
  color: #fff;
}
.button .btn:hover {
  color:bisque;
}
h1 {
  font-size: 40px;
}
.img {
  float: left;
  margin-top: -40px;
  margin-left: 50px;
}
@media (min-width: 768px) {
  .dropdown-menu {
    min-width: 130px;
    left: 50%;
    margin-left: -65px;
    background-color: rgba(255, 255, 255, 0.9);
  }
}

@media (min-width: 768px) {
  .navbar-right .dropdown-menu {
    right: 0;
  }
}
.open>a { background: #fff !important }
</style>
