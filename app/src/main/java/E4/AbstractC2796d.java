package e4;

import c4.C2288c;
import d4.AbstractC2592a;
import d4.AbstractC2599h;
import java.util.Arrays;

/* renamed from: e4.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2796d extends B3.c {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2599h f28950b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC2592a[] f28951c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2796d(C2288c c2288c, AbstractC2592a... abstractC2592aArr) {
        super((int) r2);
        long j6 = c2288c.f26245a;
        if (j6 <= 2147483647L) {
            this.f28950b = c2288c;
            this.f28951c = abstractC2592aArr;
            return;
        }
        throw new IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + j6 + '.').toString());
    }

    @Override // B3.c
    public final void c(C3.b bVar) {
        this.f28950b.b(new C2801i(bVar));
    }

    @Override // B3.c
    public final void f(C3.b bVar, int i10, int i11) {
        AbstractC2592a[] abstractC2592aArr = this.f28951c;
        this.f28950b.a(new C2801i(bVar), i10, i11, (AbstractC2592a[]) Arrays.copyOf(abstractC2592aArr, abstractC2592aArr.length));
    }
}
