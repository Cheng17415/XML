import {cart} from '../data/cart.js';
import { products } from '../data/products.js';

cart.forEach( cartItem =>{
  let product = products.filter(prod=>prod.id === cartItem.productId)
  console.log(product)
});