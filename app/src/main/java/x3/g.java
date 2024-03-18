package x3;

import p.AbstractC5028d;

/* loaded from: classes.dex */
public abstract class g extends AbstractC5028d {
    public abstract void h(B3.i iVar, Object obj);

    public final void i(Object obj) {
        B3.i c10 = c();
        try {
            h(c10, obj);
            c10.N0();
        } finally {
            g(c10);
        }
    }
}
