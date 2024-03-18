package h5;

import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;

/* renamed from: h5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3326d {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f31914b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f31915a;

    public C3326d(Map map) {
        this.f31915a = AbstractC4268D.m1(map);
    }

    public final void a(String str, String str2) {
        LinkedHashMap linkedHashMap = this.f31915a;
        if (str2 == null) {
            linkedHashMap.remove(str);
        } else {
            linkedHashMap.put(str, str2);
        }
    }
}
