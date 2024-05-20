<template>
  <div class="box">
    <div class="banner">
      <div class="jumbotron">
        <img src="../assets/images/img-lab@2x.png" class="img-responsive" alt="Responsive image">
        <h2>云端编程实验室</h2>
        <p>每人拥有自己完全独立的编程实验室，内置所有基础软件及学习素材。打开浏览器，即刻开始编程！</p>
        <div class="btn-group" role="group" aria-label="">
          <button type="button" class="btn btn-default btn-block" @click="showPopup">了解详情</button>
        </div>
      </div>

    </div>
    <div class="bannerone">
      <div class="jumbotronone">
        <img src="../assets/images/img-screens@2x.png" class="img-responsive" alt="Responsive image">
        <h2>云端编程实验室</h2>
        <p>每人拥有自己完全独立的编程实验室，内置所有基础软件及学习素材。打开浏览器，即刻开始编程！</p>
        <div class="btn-group" role="group" aria-label="">
          <button type="button" class="btn btn-default btn-block" @click="showPopup">了解详情</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    showPopup () {
      alert('马上学习')
    }
  }
}
</script>

<style lang="scss" scoped>
.banner {
  background-color: #eeeeee;
  height: 760px;
}
.bannerone {
  background-color: #fff;
  height: 760px;
}
.jumbotron {
  height: 100%;
  margin-left: 50px;
  margin-top: -30px;
}
.jumbotronone {
  background-color: #fff;
  margin-left: 50px;
  margin-top: 30px;
}
h2 {
  font-weight: 550;
  font-size: 35px;
}

p {
  font-size: 20px;
  font-weight: 500;
}

.button {
  background-color: transparent;
  color: #adaebd;
}
img {
  margin-left: 460px;
}
</style>
