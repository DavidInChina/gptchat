package Hg;

import Mf.AbstractC1013w;

/* loaded from: classes2.dex */
public abstract class q implements AbstractC0732e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7787a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7788b;

    public /* synthetic */ q(String str, int i10) {
        this.f7787a = i10;
        this.f7788b = str;
    }

    @Override // Hg.AbstractC0732e
    public final String b(AbstractC1013w abstractC1013w) {
        switch (this.f7787a) {
            case 0:
                return Bi.c.c1(this, abstractC1013w);
            default:
                return Bi.c.c1(this, abstractC1013w);
        }
    }

    @Override // Hg.AbstractC0732e
    public final String getDescription() {
        return this.f7788b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(String str, int i10, int i11) {
        this(str, 0);
        this.f7787a = i10;
        if (i10 != 1) {
        } else {
            this(str, 1);
        }
    }
}
