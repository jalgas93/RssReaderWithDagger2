package com.example.rssreaderwithdagger2.model


import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Item(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("title")
    var title: String?, // Docker :ship: MySQL setup
    @SerializedName("id")
    var id: String?, // https://sharadcodes.github.io/docker/2020/10/12/docker-mysql-setup
    @SerializedName("description")
    var description: String?, // Step 1
    @SerializedName("url")
    var url: String?, // https://sharadcodes.github.io/docker/2020/10/12/docker-mysql-setup.html
    @SerializedName("link")
    var link: String?, // https://sharadcodes.github.io/docker/2020/10/12/docker-mysql-setup.html
    @SerializedName("author")
    var author: String?, // Sharad Raj
    @SerializedName("published")
    var published: Long, // 1628401987770
    @SerializedName("created")
    var created: Long, // 1602460800000
    @SerializedName("category")
    var category: Any?, // null
    @SerializedName("content")
    var content: String?, // <h4 id="step-1">Step 1</h4><div class="language-bash highlighter-rouge"><div class="highlight"><pre class="highlight"><code>docker pull mysql/mysql-server:latest</code></pre></div></div><p>and check</p><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>docker images</code></pre></div></div><p>then</p><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>docker run --name=[name-of-container] -d mysql/mysql-server:latest</code></pre></div></div><p>then</p><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>docker ps</code></pre></div></div><h4 id="step-2-find-password">Step 2: Find password</h4><div class="language-bash highlighter-rouge"><div class="highlight"><pre class="highlight"><code>docker logs <span class="o">[</span>name-of-container] 2&gt;&amp;1 | <span class="nb">grep </span>GENERATED</code></pre></div></div><h4 id="step-3">Step 3</h4><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>docker exec -it [name-of-container] mysql -uroot -p</code></pre></div></div><h4 id="step-4-change-password">Step 4: Change password</h4><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>mysql&gt; ALTER USER 'root'@'localhost' IDENTIFIED BY 'your-password-here';</code></pre></div></div><hr /><h3 id="other-commands">Other commands</h3><h4 id="start">Start</h4><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>docker start [name-of-container]</code></pre></div></div><h4 id="stop">Stop</h4><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>docker stop [name-of-container]</code></pre></div></div><h4 id="delete">delete</h4><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>docker stop [name-of-container]docker rm [name-of-container]</code></pre></div></div><hr /><h3 id="errors">Errors</h3><p>In case of</p><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>dial unix /var/run/docker.sock: connect: permission denied</code></pre></div></div><p>run</p><div class="language-plaintext highlighter-rouge"><div class="highlight"><pre class="highlight"><code>sudo setfacl --modify user:&lt;user name or ID&gt;:rw /var/run/docker.sock</code></pre></div></div>
    @SerializedName("enclosures")
    var enclosures: List<Enclosure>?,
    @SerializedName("media")
    var media: Media?
)