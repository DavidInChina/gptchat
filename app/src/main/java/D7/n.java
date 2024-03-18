package d7;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final long f28113a;

    public n(long j6) {
        this.f28113a = j6;
    }

    public static n a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new n(Long.parseLong(jsonReader.nextString()));
                    }
                    return new n(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        if (this.f28113a == ((n) obj).f28113a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f28113a;
        return ((int) ((j6 >>> 32) ^ j6)) ^ 1000003;
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f28113a, "}");
    }
}
