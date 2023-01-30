from flask import Flask
from flask import request
import json

app = Flask(__name__)

@app.route("/predict", methods=["POST"])
def predict():
    payload = request.get_json()
    # perform prediction using the payload
    result = {"sum": sum(payload["numbers"])}
    return json.dumps(result)

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=443, ssl_context=('cert.pem', 'key.pem'))

