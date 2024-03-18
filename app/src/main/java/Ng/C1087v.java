package Ng;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Ng.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1087v {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12987b = AtomicIntegerFieldUpdater.newUpdater(C1087v.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f12988a;

    public C1087v(Throwable th2, boolean z10) {
        this.f12988a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f12988a + ']';
    }
}
