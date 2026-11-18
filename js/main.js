const contactForm = document.getElementById('contact-form');
const submitBtn = document.getElementById('submit-btn');
const formStatus = document.getElementById('form-status');

contactForm.addEventListener('submit', async (e) => {
    // 1. Prevent default browser refresh
    e.preventDefault();

    // 2. Update button state
    submitBtn.textContent = 'Sending directly to Manoj...';
    submitBtn.disabled = true;
    formStatus.textContent = '';

    // 3. Collect input values
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const message = document.getElementById('message').value;

    try {
        // 4. Send directly in background via AJAX
        const response = await fetch('https://formsubmit.co/ajax/manojkumar200109@gmail.com', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            },
            body: JSON.stringify({
                name: name,
                email: email,
                message: message,
                _subject: `New Portfolio Message from ${name}`
            })
        });

        if (response.ok) {
            formStatus.textContent = '✅ Message sent directly to Manoj! You will get a reply shortly.';
            formStatus.style.color = '#10b981'; // Green success color
            contactForm.reset();
        } else {
            throw new Error('Failed to send');
        }
    } catch (error) {
        formStatus.textContent = '❌ Could not send. Please email me directly at manojkumar200109@gmail.com';
        formStatus.style.color = '#ef4444'; // Red error color
    } finally {
        submitBtn.textContent = 'Send Message Directly';
        submitBtn.disabled = false;
    }
});