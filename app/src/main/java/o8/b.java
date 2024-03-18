package O8;

import I8.E;
import com.auth0.android.request.internal.i;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public final class b extends E {

    /* renamed from: b  reason: collision with root package name */
    public static final i f13430b = new i(5);

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f13431a = new SimpleDateFormat("hh:mm:ss a");

    @Override // I8.E
    public final Object b(P8.b bVar) {
        Time time;
        if (bVar.R0() == 9) {
            bVar.A0();
            return null;
        }
        String H02 = bVar.H0();
        try {
            synchronized (this) {
                time = new Time(this.f13431a.parse(H02).getTime());
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder s10 = android.gov.nist.core.a.s("Failed parsing '", H02, "' as SQL Time; at path ");
            s10.append(bVar.O());
            throw new RuntimeException(s10.toString(), e10);
        }
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            cVar.F();
            return;
        }
        synchronized (this) {
            format = this.f13431a.format((Date) time);
        }
        cVar.f0(format);
    }
}
