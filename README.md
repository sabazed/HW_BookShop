# BookShop
<p>You are given the simulation for selling books.</p>
<p>Each <code>Customer</code> is buying 5000 book from the <code>BookShop</code>. Buying a single
book is done buy calling <code>buyBook</code> function on <code>BookShop</code>. <code>main</code> contains
simulation: 2 users are buying books from one shop and at the end results
are displayed.</p>
<p>Current implementation is not parallel. Second costumer buys books only 
after first one finishes. Your task is to use <code>Threads</code> to make simulation
parallel: both of the <code>Customers</code> should buy books simultenuesly.</p>
<h4 id="exampleoutputs">Example Outputs</h4>
<h5 id="initialoutput">Initial output</h5>
<ul>
<li>Without threads second user always waits for the first one.</li>
</ul>
<pre><code class="hljs"><span class="hljs-number">7500</span> <span class="hljs-keyword">books </span>sold out of <span class="hljs-number">7500</span>
Peter <span class="hljs-keyword">bought </span><span class="hljs-number">5000</span> <span class="hljs-keyword">books.
</span>Pauls <span class="hljs-keyword">bought </span><span class="hljs-number">2500</span> <span class="hljs-keyword">books.
</span></code></pre>
<h5 id="wrongoutputs">Wrong outputs</h5>
<ul>
<li>Even though the shop sold 7500 books, but customers recieved more than that.</li>
</ul>
<pre><code class="hljs"><span class="hljs-number">7500</span> <span class="hljs-keyword">books </span>sold out of <span class="hljs-number">7500</span>
Peter <span class="hljs-keyword">bought </span><span class="hljs-number">4571</span> <span class="hljs-keyword">books.
</span>Pauls <span class="hljs-keyword">bought </span><span class="hljs-number">3504</span> <span class="hljs-keyword">books.
</span></code></pre>
<ul>
<li>Shop sold less than 7500 books, but customers recieved 10000 books, more than available in the shop.</li>
</ul>
<pre><code class="hljs"><span class="hljs-number">6749</span> <span class="hljs-keyword">books </span>sold out of <span class="hljs-number">7500</span>
Peter <span class="hljs-keyword">bought </span><span class="hljs-number">5000</span> <span class="hljs-keyword">books.
</span>Pauls <span class="hljs-keyword">bought </span><span class="hljs-number">5000</span> <span class="hljs-keyword">books.
</span></code></pre>
<p><strong>NOTE</strong>: Worng outputs might be indication of race condition in your code.</p>
<h5 id="correctoutputs">Correct outputs</h5>
<ul>
<li>Correct output - Sold and sum of recieved books are equal to 7500.</li>
</ul>
<pre><code class="hljs"><span class="hljs-number">7500</span> <span class="hljs-keyword">books </span>sold out of <span class="hljs-number">7500</span>
Peter <span class="hljs-keyword">bought </span><span class="hljs-number">4596</span> <span class="hljs-keyword">books.
</span>Pauls <span class="hljs-keyword">bought </span><span class="hljs-number">2904</span> <span class="hljs-keyword">books.
</span></code></pre>
<ul>
<li>Another correct output - Sold and sum of recieved books are equal to 7500.</li>
</ul>
<pre><code class="hljs"><span class="hljs-number">7500</span> <span class="hljs-keyword">books </span>sold out of <span class="hljs-number">7500</span>
Peter <span class="hljs-keyword">bought </span><span class="hljs-number">3706</span> <span class="hljs-keyword">books.
</span>Pauls <span class="hljs-keyword">bought </span><span class="hljs-number">3794</span> <span class="hljs-keyword">books.
</span></code></pre></div>
</div><!---->
<!---->
</jhi-programming-exercise-instructions><!---->
