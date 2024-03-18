package w6;

import id.AbstractC3557B;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kf.t;
import l8.AbstractC4344b;
import p5.AbstractC5091c;

/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: c  reason: collision with root package name */
    public static final File f48058c = new File("/proc/self/status");

    /* renamed from: d  reason: collision with root package name */
    public static final Lg.i f48059d = new Lg.i("VmRSS:\\s+(\\d+) kB");

    /* renamed from: a  reason: collision with root package name */
    public final File f48060a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5091c f48061b;

    public j(AbstractC5091c abstractC5091c) {
        File file = f48058c;
        AbstractC3557B.c0("statusFile", file);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f48060a = file;
        this.f48061b = abstractC5091c;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // w6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Double a() {
        List<String> list;
        Double d10;
        String str;
        File file = this.f48060a;
        AbstractC5091c abstractC5091c = this.f48061b;
        if (!AbstractC4344b.g0(file, abstractC5091c) || !AbstractC4344b.R(file, abstractC5091c)) {
            return null;
        }
        Charset charset = Lg.a.f11131a;
        AbstractC3557B.c0("charset", charset);
        if (AbstractC4344b.g0(file, abstractC5091c) && AbstractC4344b.R(file, abstractC5091c)) {
            list = (List) AbstractC4344b.a1(file, null, abstractC5091c, new G5.b(0, charset));
        } else {
            list = null;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                Lg.g a5 = f48059d.a(str2);
                if (a5 != null) {
                    str = (String) t.i2(1, a5.a());
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            String str3 = (String) t.h2(arrayList);
            if (str3 != null) {
                d10 = Lg.m.V1(str3);
                if (d10 != null) {
                    return null;
                }
                return Double.valueOf(d10.doubleValue() * 1000);
            }
        }
        d10 = null;
        if (d10 != null) {
        }
    }
}
