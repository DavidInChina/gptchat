package Ng;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nf.AbstractC4825e;

/* renamed from: Ng.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074m extends C1087v {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12958c = AtomicIntegerFieldUpdater.newUpdater(C1074m.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1074m(AbstractC4825e abstractC4825e, Throwable th2, boolean z10) {
        super(th2, z10);
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + abstractC4825e + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
