package t9;

import Yg.p;
import Yg.r;
import Yg.v;
import Yg.w;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import y.AbstractC6463a;

/* renamed from: t9.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5684a {

    /* renamed from: a  reason: collision with root package name */
    public static final r f45797a;

    /* renamed from: b  reason: collision with root package name */
    public static final DateTimeFormatter f45798b = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

    /* renamed from: c  reason: collision with root package name */
    public static final DateTimeFormatter f45799c = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

    /* renamed from: d  reason: collision with root package name */
    public static final DateTimeFormatter f45800d = DateTimeFormatter.ofPattern("MMMM");

    /* renamed from: e  reason: collision with root package name */
    public static final DateTimeFormatter f45801e = DateTimeFormatter.ofPattern("MMMM yyyy");

    static {
        p.Companion.getClass();
        p pVar = new p(AbstractC6463a.n("instant(...)"));
        w.Companion.getClass();
        f45797a = P4.a.M0(pVar, v.a()).a();
    }

    public static final int a(r rVar, p pVar) {
        w.Companion.getClass();
        return P4.a.M0(pVar, v.a()).f22423Y.getYear() - rVar.f22420Y.getYear();
    }
}
