package j0;

import id.AbstractC3557B;
import java.util.ConcurrentModificationException;
import java.util.Map;
import xf.AbstractC6441d;

/* renamed from: j0.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3879D implements Map.Entry, AbstractC6441d {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f35844Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f35845Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3880E f35846h0;

    public C3879D(C3880E c3880e) {
        this.f35846h0 = c3880e;
        Map.Entry entry = c3880e.f35851i0;
        AbstractC3557B.Z(entry);
        this.f35844Y = entry.getKey();
        Map.Entry entry2 = c3880e.f35851i0;
        AbstractC3557B.Z(entry2);
        this.f35845Z = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f35844Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f35845Z;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C3880E c3880e = this.f35846h0;
        if (c3880e.f35848Y.a().f35936d == c3880e.f35850h0) {
            Object obj2 = this.f35845Z;
            c3880e.f35848Y.put(this.f35844Y, obj);
            this.f35845Z = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
