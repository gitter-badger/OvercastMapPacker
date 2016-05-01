package com.github.wesjd.overcastmappacker.mc.inventory;

import com.avaje.ebean.common.BeanList;
import com.github.wesjd.overcastmappacker.mc.XMLWorld;
import com.github.wesjd.overcastmappacker.util.Items;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Wesley Smith
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class ContributorsInventory extends AbstractEditorInventory {

    public ContributorsInventory(Player player, XMLWorld xmlWorld) {
        super(player, xmlWorld, 54, "Authors and Contributors");
    }

    @Override
    public void build() {
        set(0, Items.GO_BACK, new Button() {
            @Override
            public void onClick(Player clicker) {
                new MainInventory(clicker, ContributorsInventory.super.xmlWorld);
            }
        });

        //TODO - Get info for the contributor and author modules from user input in chat
        set(3, Items.build(ChatColor.GREEN + "Add Contributor", Material.BOOK), new Button() {
            @Override
            public void onClick(Player clicker) {

            }
        });
        set(5, Items.build(ChatColor.GRAY + "Add Author", Material.BOOK), new Button() {
            @Override
            public void onClick(Player clicker) {

            }
        });
    }

}