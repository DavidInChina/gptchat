package O8;

import I8.E;
import com.auth0.android.request.internal.i;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public final class a extends E {

    /* renamed from: b  reason: collision with root package name */
    public static final i f13428b = new i(4);

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f13429a = new SimpleDateFormat("MMM d, yyyy");

    @Override // I8.E
    public final Object b(P8.b bVar) {
        Date parse;
        if (bVar.R0() == 9) {
            bVar.A0();
            return null;
        }
        String H02 = bVar.H0();
        try {
            synchronized (this) {
                parse = this.f13429a.parse(H02);
            }
            return new java.sql.Date(parse.getTime());
        } catch (ParseException e10) {
            StringBuilder s10 = android.gov.nist.core.a.s("Failed parsing '", H02, "' as SQL Date; at path ");
            s10.append(bVar.O());
            throw new RuntimeException(s10.toString(), e10);
        }
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        String format;
        java.sql.Date date = (java.sql.Date) obj;
        if (date == null) {
            cVar.F();
            return;
        }
        synchronized (this) {
            format = this.f13429a.format((Date) date);
        }
        cVar.f0(format);
    }
}
