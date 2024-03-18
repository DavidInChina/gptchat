package bh;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kf.v;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: bh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2211a {

    /* renamed from: a  reason: collision with root package name */
    public final String f25974a;

    /* renamed from: b  reason: collision with root package name */
    public List f25975b = v.f37483Y;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f25976c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f25977d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f25978e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f25979f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f25980g = new ArrayList();

    public C2211a(String str) {
        AbstractC3557B.c0("serialName", str);
        this.f25974a = str;
    }

    public final void a(String str, SerialDescriptor serialDescriptor, List list, boolean z10) {
        AbstractC3557B.c0("elementName", str);
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC3557B.c0("annotations", list);
        if (this.f25977d.add(str)) {
            this.f25976c.add(str);
            this.f25978e.add(serialDescriptor);
            this.f25979f.add(list);
            this.f25980g.add(Boolean.valueOf(z10));
            return;
        }
        StringBuilder s10 = android.gov.nist.core.a.s("Element with name '", str, "' is already registered in ");
        s10.append(this.f25974a);
        throw new IllegalArgumentException(s10.toString().toString());
    }
}
