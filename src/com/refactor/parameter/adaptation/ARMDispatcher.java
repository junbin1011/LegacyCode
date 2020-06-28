package com.refactor.parameter.adaptation;

import com.sun.net.httpserver.HttpsParameters;

import java.util.ArrayList;
import java.util.List;

public class ARMDispatcher {

    List<String> marketBinding = new ArrayList<>();

    public void populate(ParameterSource parameterSource) {
        String values = parameterSource.getParameterValue();
        if (values != null) {
            marketBinding.add(values);
        }
    }

}

interface ParameterSource {
    String getParameterValue();
}

class HttpParameterSource implements ParameterSource {
    HttpsParameters mHttpsParameters;

    public HttpParameterSource(HttpsParameters httpsParameters) {
        mHttpsParameters = httpsParameters;
    }

    @Override
    public String getParameterValue() {
        String[] values = mHttpsParameters.getCipherSuites();
        if (values != null && values.length > 0) {
            return values[0];
        }
        return "";
    }
}

class FakeParameterSource implements ParameterSource {

    public String value;

    @Override
    public String getParameterValue() {
        return value;
    }
}