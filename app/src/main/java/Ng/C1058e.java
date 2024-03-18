package Ng;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Ng.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058e {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12934b = AtomicIntegerFieldUpdater.newUpdater(C1058e.class, "notCompletedCount$volatile");

    /* renamed from: a  reason: collision with root package name */
    public final K[] f12935a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C1058e(K[] kArr) {
        this.f12935a = kArr;
        this.notCompletedCount$volatile = kArr.length;
    }
}
