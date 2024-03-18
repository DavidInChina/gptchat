package S1;

import Q1.l;
import a1.C1915c;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class a extends C1915c {

    /* renamed from: Z  reason: collision with root package name */
    public final EditText f16062Z;

    /* renamed from: h0  reason: collision with root package name */
    public final j f16063h0;

    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.Editable$Factory, S1.c] */
    public a(EditText editText) {
        super(9);
        this.f16062Z = editText;
        j jVar = new j(editText);
        this.f16063h0 = jVar;
        editText.addTextChangedListener(jVar);
        if (c.f16068b == null) {
            synchronized (c.f16067a) {
                try {
                    if (c.f16068b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            c.f16069c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c.f16068b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c.f16068b);
    }

    @Override // a1.C1915c
    public final KeyListener l(KeyListener keyListener) {
        if (keyListener instanceof f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new f(keyListener);
    }

    @Override // a1.C1915c
    public final InputConnection s(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection instanceof d) {
            return inputConnection;
        }
        return new d(this.f16062Z, inputConnection, editorInfo);
    }

    @Override // a1.C1915c
    public final void v(boolean z10) {
        j jVar = this.f16063h0;
        if (jVar.f16084i0 != z10) {
            if (jVar.f16083h0 != null) {
                l a5 = l.a();
                i iVar = jVar.f16083h0;
                a5.getClass();
                R4.b.U(iVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a5.f14327a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a5.f14328b.remove(iVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            jVar.f16084i0 = z10;
            if (z10) {
                j.a(jVar.f16081Y, l.a().b());
            }
        }
    }
}
