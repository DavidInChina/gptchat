package hf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: hf.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3421a implements Iterable {

    /* renamed from: Y  reason: collision with root package name */
    public final Map f32288Y;

    public C3421a(Map map) {
        this.f32288Y = map;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f32288Y.entrySet().iterator();
    }
}
