package G5;

import id.AbstractC3557B;
import java.io.File;
import java.io.FileNotFoundException;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import uf.AbstractC5917j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f6054a;

    public c(AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f6054a = abstractC5091c;
    }

    public final boolean a(File file) {
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        AbstractC3557B.c0("target", file);
        try {
            return AbstractC5917j.Z(file);
        } catch (FileNotFoundException e10) {
            P4.a.l0(this.f6054a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 7), e10, 48);
            return false;
        } catch (SecurityException e11) {
            P4.a.l0(this.f6054a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 8), e11, 48);
            return false;
        }
    }
}
