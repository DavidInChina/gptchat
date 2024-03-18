package Rh;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m.AbstractC4508E;

/* renamed from: Rh.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1303h extends AbstractC4508E {

    /* renamed from: h0  reason: collision with root package name */
    public final String f15874h0;

    public AbstractC1303h(String str, I5.h hVar) {
        super(str);
        String str2;
        if (hVar == null) {
            str2 = "";
        } else {
            str2 = hVar.toString();
        }
        this.f15874h0 = str2;
    }

    @Override // m.AbstractC4508E
    public final List f() {
        Map k10 = k();
        String str = this.f15874h0;
        List list = (List) k10.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            k10.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public abstract Map k();
}
