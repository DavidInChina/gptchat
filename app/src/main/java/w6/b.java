package w6;

import id.AbstractC3557B;
import java.io.File;
import java.util.List;
import l8.AbstractC4344b;
import p5.AbstractC5091c;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: c  reason: collision with root package name */
    public static final File f48030c = new File("/proc/self/stat");

    /* renamed from: a  reason: collision with root package name */
    public final File f48031a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5091c f48032b;

    public b(AbstractC5091c abstractC5091c) {
        File file = f48030c;
        AbstractC3557B.c0("statFile", file);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f48031a = file;
        this.f48032b = abstractC5091c;
    }

    @Override // w6.n
    public final Double a() {
        String T02;
        File file = this.f48031a;
        AbstractC5091c abstractC5091c = this.f48032b;
        if (!AbstractC4344b.g0(file, abstractC5091c) || !AbstractC4344b.R(file, abstractC5091c) || (T02 = AbstractC4344b.T0(file, abstractC5091c)) == null) {
            return null;
        }
        List F22 = Lg.n.F2(T02, new char[]{' '});
        if (F22.size() <= 13) {
            return null;
        }
        return Lg.m.V1((String) F22.get(13));
    }
}
