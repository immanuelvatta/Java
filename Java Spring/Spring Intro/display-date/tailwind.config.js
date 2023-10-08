/** @type {import('tailwindcss').Config} */
module.exports = {
    content: ["./src/main/webapp/WEB-INF/**/*.{html,js,jsp}"],
    theme: {
        extend: {},
    },
    daisyui: {
        themes: ["synthwave"],
    },
    plugins: [require("daisyui")],
}