package I8;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class r {
    public long I() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number M() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String T() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final p s() {
        if (this instanceof p) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            P8.c cVar = new P8.c(stringWriter);
            cVar.f13873k0 = true;
            K8.d.V0(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final u y() {
        if (this instanceof u) {
            return (u) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }
}
