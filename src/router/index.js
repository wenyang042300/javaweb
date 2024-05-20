import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/components/Index'
import Login from '../views/Login.vue'
import Register from '../views/Register.vue'

Vue.use(Router)

const routes = [
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  {
    path: '/',
    name: 'Index',
    component: Index
  },
  {
    path: '/register',
    name: 'register',
    component: Register
  }
]
// 3.创建router实例
const router = new Router({
  routes// (缩写)相当于routes: routes
})
// 4.创建和挂载根实例（main.js）
export default router
