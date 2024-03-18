package l5;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class d {
    public final String toString() {
        if (AbstractC3557B.K(this, c.f37837a)) {
            return "GET";
        }
        if (AbstractC3557B.K(this, b.f37836c)) {
            return "POST";
        }
        if (AbstractC3557B.K(this, b.f37835b)) {
            return "PATCH";
        }
        if (AbstractC3557B.K(this, b.f37834a)) {
            return "DELETE";
        }
        throw new RuntimeException();
    }
}
