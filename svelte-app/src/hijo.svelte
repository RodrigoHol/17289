<script>
    export let texto = "boton";
    export let color = "blue";
    export let nombre = "Svelte";
</script>

<main>
<button style="background-color: {color};">
    {texto}
</button>
</main>

<style>
    button {
        color: white;
        border: none;
        padding: 10px 20px;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
    }
</style>
