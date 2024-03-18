package A;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import z.C6685Z;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f66a = new AtomicReference(null);

    /* renamed from: b  reason: collision with root package name */
    public final Wg.d f67b = Wg.e.a();

    public static final void a(F0 f02, C0 c02) {
        while (true) {
            AtomicReference atomicReference = f02.f66a;
            C0 c03 = (C0) atomicReference.get();
            if (c03 != null && c02.f25a.compareTo(c03.f25a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c03, c02)) {
                if (atomicReference.get() != c03) {
                    break;
                }
            }
            if (c03 != null) {
                c03.f26b.k(new C6685Z(1, 0));
                return;
            }
            return;
        }
    }
}
