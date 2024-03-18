package lf;

import D1.F;
import id.AbstractC3557B;
import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import xf.AbstractC6438a;

/* renamed from: lf.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4437b extends F implements Iterator, AbstractC6438a {

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f38308j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4437b(C4439d c4439d, int i10) {
        super(c4439d);
        this.f38308j0 = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC3557B.c0("map", c4439d);
                return;
            }
            AbstractC3557B.c0("map", c4439d);
            super(c4439d);
            return;
        }
        AbstractC3557B.c0("map", c4439d);
        super(c4439d);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f38308j0;
        Serializable serializable = this.f3224i0;
        switch (i10) {
            case 0:
                a();
                int i11 = this.f3221Y;
                C4439d c4439d = (C4439d) serializable;
                if (i11 < c4439d.f38317k0) {
                    this.f3221Y = i11 + 1;
                    this.f3222Z = i11;
                    C4438c c4438c = new C4438c(c4439d, i11);
                    e();
                    return c4438c;
                }
                throw new NoSuchElementException();
            case 1:
                a();
                int i12 = this.f3221Y;
                C4439d c4439d2 = (C4439d) serializable;
                if (i12 < c4439d2.f38317k0) {
                    this.f3221Y = i12 + 1;
                    this.f3222Z = i12;
                    Object obj = c4439d2.f38312Y[i12];
                    e();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                a();
                int i13 = this.f3221Y;
                C4439d c4439d3 = (C4439d) serializable;
                if (i13 < c4439d3.f38317k0) {
                    this.f3221Y = i13 + 1;
                    this.f3222Z = i13;
                    Object[] objArr = c4439d3.f38313Z;
                    AbstractC3557B.Z(objArr);
                    Object obj2 = objArr[this.f3222Z];
                    e();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
