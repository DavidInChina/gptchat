package Dg;

import Bg.Y;
import Mf.AbstractC1000i;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kf.v;

/* loaded from: classes.dex */
public final class k implements Y {

    /* renamed from: a  reason: collision with root package name */
    public final l f3674a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f3675b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3676c;

    public k(l lVar, String... strArr) {
        AbstractC3557B.c0("formatParams", strArr);
        this.f3674a = lVar;
        this.f3675b = strArr;
        b[] bVarArr = b.f3651Y;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f3676c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(lVar.f3707Y, Arrays.copyOf(copyOf, copyOf.length))}, 1));
    }

    @Override // Bg.Y
    public final List getParameters() {
        return v.f37483Y;
    }

    @Override // Bg.Y
    public final Jf.l j() {
        return (Jf.g) Jf.g.f9106f.getValue();
    }

    @Override // Bg.Y
    public final AbstractC1000i k() {
        m.f3709a.getClass();
        return m.f3711c;
    }

    @Override // Bg.Y
    public final Collection l() {
        return v.f37483Y;
    }

    @Override // Bg.Y
    public final boolean m() {
        return false;
    }

    public final String toString() {
        return this.f3676c;
    }
}
