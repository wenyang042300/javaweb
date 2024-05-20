<template>
  <div>
    <Header></Header>
    <Banner></Banner>
    <Feature></Feature>
    <Footer></Footer>
  </div>
</template>

<script>
import Header from './Header.vue'
import Banner from './Banner'
import Feature from './Feature'
import Footer from './Footer'
export default {
  data () {
    return {
    }
  },
  components: {
    Header,
    Banner,
    Feature,
    Footer
  }
}
</script>
