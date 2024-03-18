package L8;

import I8.E;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import x8.W;

/* loaded from: classes2.dex */
public final class c extends E {

    /* renamed from: b  reason: collision with root package name */
    public static final com.auth0.android.request.internal.i f10786b = new com.auth0.android.request.internal.i(2);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10787a;

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f10787a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (K8.g.f9550a >= 9) {
            arrayList.add(W.K(2, 2));
        }
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        Date c10;
        if (bVar.R0() == 9) {
            bVar.A0();
            return null;
        }
        String H02 = bVar.H0();
        synchronized (this.f10787a) {
            try {
                Iterator it = this.f10787a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            c10 = ((DateFormat) it.next()).parse(H02);
                        } catch (ParseException unused) {
                        }
                    } else {
                        try {
                            c10 = M8.a.c(H02, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder s10 = android.gov.nist.core.a.s("Failed parsing '", H02, "' as Date; at path ");
                            s10.append(bVar.O());
                            throw new RuntimeException(s10.toString(), e10);
                        }
                    }
                }
            } finally {
            }
        }
        return c10;
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.F();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f10787a.get(0);
        synchronized (this.f10787a) {
            format = dateFormat.format(date);
        }
        cVar.f0(format);
    }
}
