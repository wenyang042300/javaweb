<template>
 <div class="feature">
   <h3>课程特色</h3>
   <div class="container">
    <div class="box">
      <div class="svg">
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-archive-fill" viewBox="0 0 16 16">
  <path d="M12.643 15C13.979 15 15 13.845 15 12.5V5H1v7.5C1 13.845 2.021 15 3.357 15zM5.5 7h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1 0-1M.8 1a.8.8 0 0 0-.8.8V3a.8.8 0 0 0 .8.8h14.4A.8.8 0 0 0 16 3V1.8a.8.8 0 0 0-.8-.8z"/>
</svg>
      </div>
      <div class="box-text">
        <h2>丰富的教学服务</h2>
        <p>特色教学服务功能，各种配套教学服务，在线学习从未如此轻松。</p>
      </div>
      <div class="box-link">
        <a href="#">马上学习></a>
      </div>
    </div>
     <!-- 第一个盒子：图片 -->
     <div class="box">
     <div class="svg">
      <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
  <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0"/>
  <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8m8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1"/>
</svg>
     </div>
      <div class="box-text">
        <h2>多元的学习方式</h2>
        <p>知识提炼、答疑解惑、实时互动、开发有特色的教学服务方式。</p>
      </div>
      <div class="box-link">
        <a href="#">马上学习></a>
      </div>
    </div>
     <!-- 第一个盒子：图片 -->
     <div class="box">
      <div class="svg">
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-toggles" viewBox="0 0 16 16">
  <path d="M4.5 9a3.5 3.5 0 1 0 0 7h7a3.5 3.5 0 1 0 0-7zm7 6a2.5 2.5 0 1 1 0-5 2.5 2.5 0 0 1 0 5m-7-14a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5m2.45 0A3.5 3.5 0 0 1 8 3.5 3.5 3.5 0 0 1 6.95 6h4.55a2.5 2.5 0 0 0 0-5zM4.5 0h7a3.5 3.5 0 1 1 0 7h-7a3.5 3.5 0 1 1 0-7"/>
</svg>
      </div>
      <div class="box-text">
        <h2>高品质的学习体验</h2>
        <p>多屏合一，随时学习，随时在线，学习记录一目了然，知识充电不再受限。</p>
      </div>
      <div class="box-link">
        <a href="#">马上学习></a>
      </div>
    </div>
  </div>
 </div>
</template>

<script>
export default {
  data () {
    return {
    }
  }
}
</script>

<style lang="scss" scoped>
.feature {
  margin-left: 50px;
  margin-top: -90px;
}
h3 {
  font-weight: 550;
  font-size: 28px;
  padding-bottom: 30px;
  border-bottom: 1px solid #ccc;
}
.container {
  display: flex;
  margin-left: -50px;
  width: 100%;
}

.box {
  flex: 1;
  margin: 0 10px;
  padding: 20px;
  margin-right: 20px;
}

.box h2 {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 10px;
}

.box p {
  font-size: 16px;
}

.box a {
  color: blue;
  text-decoration: underline;
}
.svg {
  width: 60px;
  height: 60px;
  background-color: #335bde;
  color: #fff;
  border-radius: 10px;
}
svg {
  width: 40px;
  height: 40px;
  margin: 10px;
}
</style>
