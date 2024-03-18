package df;

import android.gov.nist.javax.sdp.MediaDescriptionImpl;
import android.gov.nist.javax.sdp.fields.AttributeField;
import cf.AbstractC2408g;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import jf.C3959i;
import kf.C4270F;
import z.AbstractC6708l;

/* renamed from: df.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2638c {

    /* renamed from: a  reason: collision with root package name */
    public static final Lg.i f28261a = new Lg.i("(\\d*) ([\\w\\-.]*)(?:\\s*/(\\d*)(?:\\s*/(\\S*))?)?");

    /* renamed from: b  reason: collision with root package name */
    public static final Lg.i f28262b = new Lg.i("(\\d*) ([\\S| ]*)");

    /* renamed from: c  reason: collision with root package name */
    public static final Lg.i f28263c = new Lg.i("(\\d+)(?:/(\\w+))?(?: (urn:ietf:params:rtp-hdrext:encrypt))? (\\S*)(?: (\\S*))?");

    public static final ArrayList a(MediaDescriptionImpl mediaDescriptionImpl) {
        C2644i c2644i;
        Long l10;
        Vector attributes = mediaDescriptionImpl.getAttributes(true);
        AbstractC3557B.b0("getAttributes(true)", attributes);
        ArrayList arrayList = new ArrayList();
        for (Object obj : attributes) {
            if (obj instanceof AttributeField) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (AbstractC3557B.K(((AttributeField) next).getAttribute().getName(), "rtpmap")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AttributeField attributeField = (AttributeField) it2.next();
            String value = attributeField.getValue();
            AbstractC3557B.b0("it.value", value);
            Lg.g a5 = f28261a.a(value);
            C3959i c3959i = null;
            if (a5 == null) {
                c2644i = null;
            } else {
                String str = (String) ((C4270F) a5.a()).get(2);
                String str2 = (String) ((C4270F) a5.a()).get(3);
                String str3 = (String) ((C4270F) a5.a()).get(4);
                long parseLong = Long.parseLong((String) ((C4270F) a5.a()).get(1));
                AbstractC3557B.c0("str", str2);
                if (str2.length() == 0) {
                    l10 = null;
                } else {
                    l10 = Long.valueOf(Long.parseLong(str2));
                }
                c2644i = new C2644i(parseLong, str, l10, b(str3));
            }
            if (c2644i == null) {
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                    attributeField.encode();
                    Mi.a.f(new Object[0]);
                }
            } else {
                c3959i = new C3959i(attributeField, c2644i);
            }
            if (c3959i != null) {
                arrayList3.add(c3959i);
            }
        }
        return arrayList3;
    }

    public static final String b(String str) {
        AbstractC3557B.c0("str", str);
        if (str.length() == 0) {
            return null;
        }
        return str;
    }
}
