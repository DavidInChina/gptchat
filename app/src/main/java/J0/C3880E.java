package j0;

import java.util.Iterator;
import java.util.Map;
import xf.AbstractC6438a;

/* renamed from: j0.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3880E extends AbstractC3881F implements Iterator, AbstractC6438a {

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f35847k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3880E(x xVar, Iterator it, int i10) {
        super(xVar, it);
        this.f35847k0 = i10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f35847k0) {
            case 0:
                a();
                if (this.f35851i0 != null) {
                    return new C3879D(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f35852j0;
                if (entry != null) {
                    a();
                    return entry.getKey();
                }
                throw new IllegalStateException();
            default:
                Map.Entry entry2 = this.f35852j0;
                if (entry2 != null) {
                    a();
                    return entry2.getValue();
                }
                throw new IllegalStateException();
        }
    }
}
