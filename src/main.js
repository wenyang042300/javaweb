import Vue from 'vue'
import App from './App'
import axios from 'axios'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import router from './router'
import $ from 'jquery'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap/dist/js/bootstrap.js'
import 'animate.css'
import { WOW } from 'wowjs'

Vue.config.productionTip = false
Vue.use(ElementUI)// 全局注入
Vue.prototype.$axios = axios
axios.defaults.baseURL = 'http://localhost:3000'

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  axios,
  components: { App },
  template: '<App/>',
  mounted () {
    // var wow = new WOW({
    //   boxClass: 'wow',
    //   animateClass: 'animated',
    //   offset: 0,
    //   mobile: true
    // })
    // wow.init()
    new WOW().init()
  }
})
